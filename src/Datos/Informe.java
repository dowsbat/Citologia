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
public class Informe {
    private int Id_Informe;
    private int Id_Antecedentes;
    private int Id_Lesion;
    private int Id_Motivo_Insatisfactorio;
    private int Id_Cancer;
    private int Id_Cambios;

    public int getId_Informe() {
        return Id_Informe;
    }

    public void setId_Informe(int Id_Informe) {
        this.Id_Informe = Id_Informe;
    }

    public int getId_Antecedentes() {
        return Id_Antecedentes;
    }

    public void setId_Antecedentes(int Id_Antecedentes) {
        this.Id_Antecedentes = Id_Antecedentes;
    }

    public int getId_Lesion() {
        return Id_Lesion;
    }

    public void setId_Lesion(int Id_Lesion) {
        this.Id_Lesion = Id_Lesion;
    }

    public int getId_Motivo_Insatisfactorio() {
        return Id_Motivo_Insatisfactorio;
    }

    public void setId_Motivo_Insatisfactorio(int Id_Motivo_Insatisfactorio) {
        this.Id_Motivo_Insatisfactorio = Id_Motivo_Insatisfactorio;
    }

    public int getId_Cancer() {
        return Id_Cancer;
    }

    public void setId_Cancer(int Id_Cancer) {
        this.Id_Cancer = Id_Cancer;
    }

    public int getId_Cambios() {
        return Id_Cambios;
    }

    public void setId_Cambios(int Id_Cambios) {
        this.Id_Cambios = Id_Cambios;
    }

    public Informe(int Id_Informe, int Id_Antecedentes, int Id_Lesion, int Id_Motivo_Insatisfactorio, int Id_Cancer, int Id_Cambios) {
        this.Id_Informe = Id_Informe;
        this.Id_Antecedentes = Id_Antecedentes;
        this.Id_Lesion = Id_Lesion;
        this.Id_Motivo_Insatisfactorio = Id_Motivo_Insatisfactorio;
        this.Id_Cancer = Id_Cancer;
        this.Id_Cambios = Id_Cambios;
    }
}
