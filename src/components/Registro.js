import React from 'react'
import '../styles/Registro.css'
import { useDispatch } from 'react-redux'
import { useForm } from '../hooks/useForm'
import { registerAsync } from '../redux/actions/userAction'
import { Link } from 'react-router-dom'

const Registro = () => {

  const dispatch = useDispatch()

  const [formValue, handleInputChange, reset] = useForm({
    nombre: '',
    email: '',
    password: '',
    password2: '',
  })

  const { nombre, email, password, password2 } = formValue;

  const handleSubmit = (e) => {
    e.preventDefault()
    console.log(formValue)
    dispatch(registerAsync(nombre, email, password, password2))
    reset()
  }



  return (
    <div className='contPrinc flex'>
      {/* <img alt='logo' src={logo} /> */}
      <div className='contForm'>
        <form onSubmit={handleSubmit} className='form flex'>
          <h2 className='title'>Crear cuenta</h2>
          <label className='primerRegistro'>
            <b>Tu nombre</b>
          </label>
          <input
            name='nombre'
            value={nombre}
            onChange={handleInputChange}
            required
            className='camposRegistro ' />
          <label className='primerRegistro'><b>Correo electrónico</b></label>
          <input
            required
            value={email}
            name='email'
            onChange={handleInputChange}
            className='camposRegistro' />
          <label className='primerRegistro'><b>Contraseña</b></label>
          <input
            name='password'
            value={password}
            type="password"
            required
            onChange={handleInputChange}
            placeholder='como mínimo 6 caracteres' className='camposRegistro' />
          <p><span className='span info'>i</span> la contraseña debe contener  al menos 6 caracteres</p>
          <label className='primerRegistro'><b>Vuelva a escribir la contraseña</b></label>
          <input
            value={password2}
            type="password"
            name='password2'
            required
            onChange={handleInputChange}
            className='camposRegistro' />
          <button className='btn'>Continuar</button>
          <p className='condiciones'>Al crear una cuenta, aceptas las <span className='span'> Condiciones de Uso </span> y el<span className='span'> Aviso de Privacidad</span> de ecommerce.com.</p>
          <div>
            <Link to="/"><button className='btnCrearCuenta'>Iniciar Sesión</button></Link>
          </div>
        </form>
      </div>
    </div>
  )
}

export default Registro