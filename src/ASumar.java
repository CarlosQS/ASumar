
public class ASumar {

    private String valor_inicial;

    /**
     * Constructor de la clase ASumar.
     * @param string Valor introducido
     */
	public ASumar(String string) {
        this.valor_inicial = string;
    }

	/**
	 * Método para mostrar el valor que le hemos dado desde el constructor.
	 * @return Devuelve una cadena de texto de tipo String
	 */
    public String mostrar() {
        String numero = valor_inicial;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
        return null;
    }
    
    
	
}
