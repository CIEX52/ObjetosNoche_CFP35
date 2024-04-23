function reloj(){
    var momentoActual = new Date()
    hora = momentoActual.getHours()
    minuto = momentoActual.getMinutes()
    segundo = momentoActual.getSeconds()

    horaImprimible =    hora.toString().padStart(2, '0') + ":" +
                        minuto.toString().padStart(2, '0') + ":" +
                        segundo.toString().padStart(2, '0')
    
    document.getElementById("time").value = horaImprimible

    setInterval("reloj()", 1000)
}