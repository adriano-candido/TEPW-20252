import React, {useState, useEffect} from 'react';
import api from "../../services/api";
import './style.css';

export default function User() {

    const [id, setId] = useState(null);
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [login, setLogin] = useState("");
    const [password, setPassword] = useState("");

    function resetForm(){
        setId(null);
        setName('');
        setEmail('');
        setLogin('');
        setPassword('');
    }

    return (
        <h1>Olá mundo</h1>
    );
}