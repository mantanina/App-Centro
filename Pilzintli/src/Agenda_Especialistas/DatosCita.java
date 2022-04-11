package Agenda_Especialistas;

public class DatosCita {
    
    private int id;
    private String fecha;
    private String hora;
    private int paciente_id;
    private String nombre_paciente;
    private int especialista_id;
    private String nombre_Especialista;
    private int tipo_consulta_id;
    private String tipo_consulta;
    private int terapia_id;
    private String terapia;

    public DatosCita() {
    }

    public DatosCita(int id, String fecha, String hora, int paciente_id, String nombre_paciente, int especialista_id, String nombre_Especialista, int tipo_consulta_id, String tipo_consulta, int terapia_id, String terapia) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.paciente_id = paciente_id;
        this.nombre_paciente = nombre_paciente;
        this.especialista_id = especialista_id;
        this.nombre_Especialista = nombre_Especialista;
        this.tipo_consulta_id = tipo_consulta_id;
        this.tipo_consulta = tipo_consulta;
        this.terapia_id = terapia_id;
        this.terapia = terapia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(int paciente_id) {
        this.paciente_id = paciente_id;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public int getEspecialista_id() {
        return especialista_id;
    }

    public void setEspecialista_id(int especialista_id) {
        this.especialista_id = especialista_id;
    }

    public String getNombre_Especialista() {
        return nombre_Especialista;
    }

    public void setNombre_Especialista(String nombre_Especialista) {
        this.nombre_Especialista = nombre_Especialista;
    }

    public int getTipo_consulta_id() {
        return tipo_consulta_id;
    }

    public void setTipo_consulta_id(int tipo_consulta_id) {
        this.tipo_consulta_id = tipo_consulta_id;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }

    public int getTerapia_id() {
        return terapia_id;
    }

    public void setTerapia_id(int terapia_id) {
        this.terapia_id = terapia_id;
    }

    public String getTerapia() {
        return terapia;
    }

    public void setTerapia(String terapia) {
        this.terapia = terapia;
    }
    
    

    
}
