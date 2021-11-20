package codigo;

public class variables {
    String Nombre;
    String Apellido;
    String ID;
    String Sexo;
    String Direccion;
    String Lugar;
    String Motivo;
    String Medico;
    String Fecha;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getMedico() {
        return Medico;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public variables(String Nombre, String Apellido, String ID, String Sexo, String Direccion, String Lugar, String Motivo, String Medico, String Fecha) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID = ID;
        this.Sexo = Sexo;
        this.Direccion = Direccion;
        this.Lugar = Lugar;
        this.Motivo = Motivo;
        this.Medico = Medico;
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
}