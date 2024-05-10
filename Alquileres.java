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
public class Alquileres {
    
    private int numAlquiler;
    private String  fechContrato;
    private int cantMeses;
    private int numAdultos;
    private int  numNinos;
    private int depositoGarantia;
    private int precioAlquiler;
    private int porcincremAnual;
    private int cedInquilino;
    private int idVvienda;
    private String estado;

    public Alquileres(int numAlquiler, String fechContrato, int cantMeses, int numAdultos, int numNinos, int depositoGarantia, int precioAlquiler, int porcincremAnual, int cedInquilino, int idVvienda, String estado) {
        this.numAlquiler = numAlquiler;
        this.fechContrato = fechContrato;
        this.cantMeses = cantMeses;
        this.numAdultos = numAdultos;
        this.numNinos = numNinos;
        this.depositoGarantia = depositoGarantia;
        this.precioAlquiler = precioAlquiler;
        this.porcincremAnual = porcincremAnual;
        this.cedInquilino = cedInquilino;
        this.idVvienda = idVvienda;
        this.estado = estado;
    }

    public int getNumAlquiler() {
        return numAlquiler;
    }

    public void setNumAlquiler(int numAlquiler) {
        this.numAlquiler = numAlquiler;
    }

    public String getFechContrato() {
        return fechContrato;
    }

    public void setFechContrato(String fechContrato) {
        this.fechContrato = fechContrato;
    }

    public int getCantMeses() {
        return cantMeses;
    }

    public void setCantMeses(int cantMeses) {
        this.cantMeses = cantMeses;
    }

    public int getNumAdultos() {
        return numAdultos;
    }

    public void setNumAdultos(int numAdultos) {
        this.numAdultos = numAdultos;
    }

    public int getNumNinos() {
        return numNinos;
    }

    public void setNumNinos(int numNinos) {
        this.numNinos = numNinos;
    }

    public int getDepositoGarantia() {
        return depositoGarantia;
    }

    public void setDepositoGarantia(int depositoGarantia) {
        this.depositoGarantia = depositoGarantia;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public int getPorcincremAnual() {
        return porcincremAnual;
    }

    public void setPorcincremAnual(int porcincremAnual) {
        this.porcincremAnual = porcincremAnual;
    }

    public int getCedInquilino() {
        return cedInquilino;
    }

    public void setCedInquilino(int cedInquilino) {
        this.cedInquilino = cedInquilino;
    }

    public int getIdVvienda() {
        return idVvienda;
    }

    public void setIdVvienda(int idVvienda) {
        this.idVvienda = idVvienda;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
