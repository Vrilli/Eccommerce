import React from 'react'
import '../styles/Registro.css'
import google from '../assets/logoGoogle.png'
import { useForm } from '../hooks/useForm'
import { useDispatch } from 'react-redux'
import { Link } from 'react-router-dom'
import { loginEmailyPassAsync, loginGoogleAsync } from '../redux/actions/userAction'

const IniciarSesion = () => {

  const dispatch = useDispatch()
  const [formValue, handleInputChange, reset] = useForm({
    email: '',
    password: '',
  })

  const { email, password } = formValue

  const handleSubmit = (e) => {
    e.preventDefault()
    dispatch(loginEmailyPassAsync(email, password))
    reset()
  }
  const handleGoogle = () => {
    dispatch(loginGoogleAsync())
  }


  return (
    <div className='contPrinc flex'>
      <div className='contForm'>
        <form onSubmit={handleSubmit} className='form flex'>
          <h2 className='title'>Iniciar sesión</h2>
          <label
            className='primerRegistro'
          >
            <b>Dirección de correo electrónico </b>
          </label>
          <input
            // required
            className='camposRegistro'
            type="email"
            aria-label='email'
            name='email'
            value={email}
            onChange={handleInputChange} />
          <label
            className='primerRegistro'
          >
            <b>Contraseña</b>
          </label>
          <input
            // required
            className='camposRegistro'
            type="password"
            aria-label='password'
            name='password'
            value={password}
            onChange={handleInputChange} />
          <label className='primerRegistro'>
            <b>Inicia sesión con:</b>
          </label>
          <div className='logos'>
            <button
              className='btnsLogos'
              onClick={handleGoogle}>
              <img alt='' src={google} width='30px' /></button>
          </div>
          <button
            className='btn' type='submit'>Continuar</button>
          <p className='condiciones'>Al continuar aceptas las <span className='span'> Condiciones de Uso </span> y el<span className='span'> Aviso de Privacidad</span> de Ecommerce.</p>
          <div>
            <p>&#10148;<span className='span'>¿Necesitas ayuda?</span></p>
          </div>
        </form>
      </div>
      {/* <div className='constSecund flex'>
        <p>¿Eres Nuevo en Ecommerce?</p>
        <Link to="/registro"><button className='btnCrearCuenta'>Crea tu cuenta de Ecommerce</button></Link>
      </div> */}
    </div>
  )
}

export default IniciarSesion