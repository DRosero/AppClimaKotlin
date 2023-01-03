package com.aplicacion.appclima

class Ciudad(ciudad:String, numeroGrados:Int, clima:String) {

    var nombreCiudad="";
    var grados=0;
    var estadoClima="";

    init {
        this.nombreCiudad=ciudad;
        this.grados=numeroGrados;
        this.estadoClima=clima;
    }
}