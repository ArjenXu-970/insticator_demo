
import './App.css';
import HeaderComponent from './components/HeaderComponents';
import FooterComponent from './components/FooterComponents';
/*import Questionnaire from './components/Questionnaire';*/
import Nav from './components/Nav';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Questionnaire from './components/Questionnaire';

function App() {
    
    return (
        <div>
        <Router>
            <HeaderComponent />
            <div className="container">
                
                <Nav />
                <Routes>
                        <Route path="/" exact component={Nav} />
                        <Route path="api/questions/userid=:id" component={Questionnaire} />
                </Routes>
                
              
            </div>
            <FooterComponent />
        </Router>
            </div>
    
  );
}

export default App;
