import React, { useState, useEffect } from 'react';
import api from "../../services/api";
import './style.css';

export default function User() {
    const [users, setUsers] = useState([]);

    const [id, setId] = useState(null);
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [login, setLogin] = useState("");
    const [password, setPassword] = useState("");

    function resetForm() {
        setId(null);
        setName('');
        setEmail('');
        setLogin('');
        setPassword('');
    }

    useEffect(() => {
        loadUsers();
    }, []);

    async function loadUsers() {
        try {
            const response = await api.get("/v1/user/all");
            setUsers(response.data);
        } catch (error) {
            console.error(error);
            alert("Erro ao carregar usuários");
        }
    }

    async function save(event) {
        event.preventDefault();

        const payload = { id, name, email, login, password };

        try {
            if (id) {
                await api.put('/v1/user', payload);
            } else {
                await api.post('/v1/user', payload);
            }

            await loadUsers();
            resetForm();
        } catch (error) {
            console.error(error);
            alert('Erro ao salvar usuário');
        }
    }

    async function deleteUser(id) {
        if (!window.confirm('Tem certeza que deseja excluir?')) return;

        try {
            await api.delete(`/v1/user/${id}`);
            setUsers((old) => old.filter((user) => user.id !== id));
        } catch (error) {
            console.error(error);
            alert('Erro ao excluir usuário');
        }
    }

    function updateUser(user){
        setId(user.id);
        setName(user.name);
        setEmail(user.email);
        setLogin(user.login);
        setPassword('');
    }





    return (
        <div className="app-container">
            <h1>CRUD de Usuários</h1>

            <form className="user-form" onSubmit={save}>
                <h2>{id != null ? 'Editar usuário' : 'Novo usuário'}</h2>

                <div className="user-form-fields">
                    <input name="name" value={name} onChange={e => setName(e.target.value)} placeholder="Nome Completo" required />
                    <input name="email" value={email} onChange={e => setEmail(e.target.value)} placeholder="E-mail" required />
                    <input name="login" value={login} onChange={e => setLogin(e.target.value)} placeholder="Usuário" required />
                    <input name="password" value={password} onChange={e => setPassword(e.target.value)} placeholder="Senha" type="password" required={!id} />
                </div>

                <div className="user-form-actions">
                    <button className="button" type="submit">
                        {id != null ? 'Atualizar' : 'Salvar'}
                    </button>
                </div>
            </form>


            <table className="user-table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th>Login</th>
                        <th>Ações</th>
                    </tr>
                </thead>

                <tbody>
                    {users.map((user) => (
                        <tr key={user.id}>
                            <td>{user.id}</td>
                            <td>{user.name}</td>
                            <td>{user.email}</td>
                            <td>{user.login}</td>
                            <td className="user-actions-cell">
                                <button type="button" className="action-button" onClick={() => updateUser(user)}>Editar</button>
                                <button type="button" className="action-button" onClick={() => deleteUser(user.id)}>Excluir</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>

        </div>

    );
}