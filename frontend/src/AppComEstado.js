import React, { useState } from 'react';

export default function AppComEstado() {
  const [count, setCount] = useState(0)

  function countFunction(){
    setCount(count + 1)
  }
  
  return (
    <div>
      <h3>Com estado</h3>
      <p>Valor: {count}</p>
      <button onClick={countFunction}>Clique</button>
    </div>
  );
}

