import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import Comp from './Comp'
import AppComEstado from './AppComEstado';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Comp />
    <App />
    <AppComEstado />
  </React.StrictMode>
);