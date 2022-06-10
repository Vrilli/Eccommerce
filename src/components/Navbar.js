import React from 'react'
import { useDispatch } from 'react-redux';
import { logoutAsync } from '../redux/actions/userAction';
import Carrito from "./Carrito"
import { useNavigate } from 'react-router-dom'
import '../styles/Nav.css'

const Navbar = () => {

  const dispatch = useDispatch();
  const navigate = useNavigate();
  const handleLogout = () => {
    dispatch(logoutAsync())
    navigate("/login")
  }

  return (
    <div>
       <main>
          <nav>
          <Carrito /> 
          <div onClick={handleLogout} className='flex column contIdentificate pointer'>
            <p className='text'>Cerrar sesión</p>

          </div>
          </nav>
          
       </main>
    </div>
  )
}

export default Navbar