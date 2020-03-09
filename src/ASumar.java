
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
        if (numero.length() > 1) {
            return (numero + " = " + total());
        }
        return null;
    }
    
    /**
     * Método que suma dígito a dígito un número.
     * @return Devuelve la suma del número
     */
    public int total() {
        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {
            String digito = valor_inicial.substring(i, i+1);
            suma += Integer.parseInt(digito);
        }
        return suma;

    }
}
