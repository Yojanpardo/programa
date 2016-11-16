/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa1;


public class datos {
    String nombre;
    int cedula;
    int telefono;
    int horas;
    int valor;
    int valorextras;
    int valorextrasdobles;

    public int getValorextras() {
        return valorextras;
    }

    public void setValorextras(int valorextras) {
        this.valorextras = valorextras;
    }

    public int getValorextrasdobles() {
        return valorextrasdobles;
    }

    public void setValorextrasdobles(int valorextrasdobles) {
        this.valorextrasdobles = valorextrasdobles;
    }
    int horasextras;

    int horasextrasdobles;
    int total;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula+"";
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHorasextras() {
        return horasextras;
    }

    public void setHorasextras(int horasextras) {
        this.horasextras = horasextras;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTelefono() {
        return telefono+"";
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getHorasextrasdobles() {
        return horasextrasdobles;
    }

    public void setHorasextrasdobles(int horasextrasdobles) {
        this.horasextrasdobles = horasextrasdobles;
    }
}
