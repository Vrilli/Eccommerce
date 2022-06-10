import { useDispatch } from 'react-redux';
import { useNavigate } from 'react-router-dom';
import './App.css';
import { logoutAsync } from './redux/actions/userAction';

function App() {
  const dispatch = useDispatch();
  const navigate = useNavigate();
  const handleLogout = () => {
    dispatch(logoutAsync())
    navigate("/login")
  }

  return (
    <div className="App">
      <div onClick={handleLogout} className='flex column contIdentificate pointer'>
        <p className='text'>Desconectate</p>
      </div>
     <button></button>
    </div>
  );
}

export default App;
