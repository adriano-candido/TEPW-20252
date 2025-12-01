import React from 'react';

export default function App() {
  let count = 0;

  function countFunction(){
    count++;
    console.log("count = ", count);
  }
  
  return (
    <div>
      <h3>Sem estado</h3>
      <p>Valor: {count}</p>
      <button onClick={countFunction}>Clique</button>
    </div>
  );
}

