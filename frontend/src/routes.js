import React from 'react';
import {BrowserRouter, Routes, Route} from 'react-router-dom';

import User from './pages/User'

export default function RoutesApp(){
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/user" element={<User />} />
            </Routes>
        </BrowserRouter>
    )
}