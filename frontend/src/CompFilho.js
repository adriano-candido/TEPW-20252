import React from 'react';

export default function CompFilho(props) {
  
  return (
    <div>
      <h3>Nome: {props.name}</h3>
      <h3>Idade: {props.age}</h3>
    </div>
  );
}
