/** Clase para objeto rectangulo
 * 
 * @author Mariano Murcia Ortuño
 * @version 1.2
 * @since 15/02/2023
 */
public class Rectangulo_MMO extends FiguraGeometrica_MMO {
	private double l1;
	private double l2;
	
	/** Constructor de la clase rectangulo
	 * 
	 * @param tipoFigura tipo de figura 
	 * @param lG lado 1
	 * @param lP lado 2
	 */
	public Rectangulo_MMO(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/** Método de cálculo del área
	 *  @return area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/** Métod de cáculo del perímetro
	 * @return perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
