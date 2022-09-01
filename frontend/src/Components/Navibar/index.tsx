import { ReactComponent as Ima } from 'assets/img/github.svg';
import './styles.css';
function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/alefzx" target="_blank" rel="noreferrer">
                        <div className="dsmovie-contact-container">
                            <Ima />
                            <p className="dsmovie-contact-link">/devsuperior</p>

                        </div>
                    </a>
                </div>
            </nav>
        </header>

    );
}
export default Navbar;

