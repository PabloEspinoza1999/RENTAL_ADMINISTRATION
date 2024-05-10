/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallaprinc;

/**
 *
 * @author pc
 */
public class Viviendas {
    private int Idviviendas;
    private String Descripcion;
    private String Direccion;
    private int mtsConstrucc;
    private int mtsLote;
    private String tipoConstruccion;
    private Boolean cochera;
    private int CantHabitacion;
    private int Cantbanos;
    private String carretera;
    private int precioBase;
    private int depositoGarantia;
    private String Propetarios; 
    private String estado;

    public Viviendas(int Idviviendas, String Descripcion, String Direccion, int mtsConstrucc, int mtsLote, String tipoConstruccion, Boolean cochera, int CantHabitacion, int Cantbanos, String carretera, int precioBase, int depositoGarantia, String Propetarios, String estado) {
        this.Idviviendas = Idviviendas;
        this.Descripcion = Descripcion;
        this.Direccion = Direccion;
        this.mtsConstrucc = mtsConstrucc;
        this.mtsLote = mtsLote;
        this.tipoConstruccion = tipoConstruccion;
        this.cochera = cochera;
        this.CantHabitacion = CantHabitacion;
        this.Cantbanos = Cantbanos;
        this.carretera = carretera;
        this.precioBase = precioBase;
        this.depositoGarantia = depositoGarantia;
        this.Propetarios = Propetarios;
        this.estado = estado;
    }

      public String getPropetarios() {
        return Propetarios;
    }

    public void setPropetarios(String Propetarios) {
        this.Propetarios = Propetarios;
    }
    public int getIdviviendas() {
        return Idviviendas;
    }

    public void setIdviviendas(int Idviviendas) {
        this.Idviviendas = Idviviendas;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getMtsConstrucc() {
        return mtsConstrucc;
    }

    public void setMtsConstrucc(int mtsConstrucc) {
        this.mtsConstrucc = mtsConstrucc;
    }

    public int getMtsLote() {
        return mtsLote;
    }

    public void setMtsLote(int mtsLote) {
        this.mtsLote = mtsLote;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public Boolean getCochera() {
        return cochera;
    }

    public void setCochera(Boolean cochera) {
        this.cochera = cochera;
    }

    public int getCantHabitacion() {
        return CantHabitacion;
    }

    public void setCantHabitacion(int CantHabitacion) {
        this.CantHabitacion = CantHabitacion;
    }

    public int getCantbanos() {
        return Cantbanos;
    }

    public void setCantbanos(int Cantbanos) {
        this.Cantbanos = Cantbanos;
    }

    public String getCarretera() {
        return carretera;
    }

    public void setCarretera(String carretera) {
        this.carretera = carretera;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getDepositoGarantia() {
        return depositoGarantia;
    }

    public void setDepositoGarantia(int depositoGarantia) {
        this.depositoGarantia = depositoGarantia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
}
