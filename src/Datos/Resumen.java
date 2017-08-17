/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Oscar Rivera
 */
public class Resumen extends Tamizaje {

    private int Id_Resumen;
    private int Id_Temporada;
    private int Id_Mes;
    private int Id_Semana;
    private int Id_SIBASI;
    private int Id_Estado;
    private int Id_Informe;
    private int Id_Usuario;
    private int Id_Paciente;

    public Resumen(int Id_Resumen, int Id_Temporada, int Id_Mes, int Id_Semana, int Id_SIBASI, int Id_Estado, int Id_Informe, int Id_Usuario, int Id_Paciente) {
        this.Id_Resumen = Id_Resumen;
        this.Id_Temporada = Id_Temporada;
        this.Id_Mes = Id_Mes;
        this.Id_Semana = Id_Semana;
        this.Id_SIBASI = Id_SIBASI;
        this.Id_Estado = Id_Estado;
        this.Id_Informe = Id_Informe;
        this.Id_Usuario = Id_Usuario;
        this.Id_Paciente = Id_Paciente;
    }
    
    public int getId_Resumen() {
        return Id_Resumen;
    }

    public void setId_Resumen(int Id_Resumen) {
        this.Id_Resumen = Id_Resumen;
    }

    public int getId_Temporada() {
        return Id_Temporada;
    }

    public void setId_Temporada(int Id_Temporada) {
        this.Id_Temporada = Id_Temporada;
    }

    public int getId_Mes() {
        return Id_Mes;
    }

    public void setId_Mes(int Id_Mes) {
        this.Id_Mes = Id_Mes;
    }

    public int getId_Semana() {
        return Id_Semana;
    }

    public void setId_Semana(int Id_Semana) {
        this.Id_Semana = Id_Semana;
    }

    public int getId_SIBASI() {
        return Id_SIBASI;
    }

    public void setId_SIBASI(int Id_SIBASI) {
        this.Id_SIBASI = Id_SIBASI;
    }

    public int getId_Estado() {
        return Id_Estado;
    }

    public void setId_Estado(int Id_Estado) {
        this.Id_Estado = Id_Estado;
    }

    public int getId_Informe() {
        return Id_Informe;
    }

    public void setId_Informe(int Id_Informe) {
        this.Id_Informe = Id_Informe;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public int getId_Paciente() {
        return Id_Paciente;
    }

    public void setId_Paciente(int Id_Paciente) {
        this.Id_Paciente = Id_Paciente;
    }
    
}
