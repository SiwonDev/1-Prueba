
public class Arma 
{
	private double daño;
	private double penetracion;
	private boolean activo;
	
	
	
	
	public Arma(double pDaño, double pPenetracion, boolean pActivo)
	{
		this.daño = pDaño;
		this.penetracion = pPenetracion;
		this.activo = pActivo;
	}
	
	//Get y Set
	
	public double getDaño()
	{
		return this.daño;
	}
	public void setDaño(double pDaño)
	{
		this.daño = pDaño;
	}
	
	public double getPenetracion()
	{
		return this.penetracion;
	}
	public void setPenetracion(double pPenetracion)
	{
		this.penetracion = pPenetracion;
	}
	
	public boolean getActivo()
	{
		return this.activo;
	}
	public void setActivo(boolean pActivo)
	{
		this.activo = pActivo;
	}
	
	
	//METODOS
	
	public String estadsticasArma()
	{
		String mensaje = "D";
		return mensaje;
	}
	
	
	
	
	
	
	
	

}
