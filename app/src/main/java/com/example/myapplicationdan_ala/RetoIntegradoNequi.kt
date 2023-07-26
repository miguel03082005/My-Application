package com.example.myapplicationdan_ala

class RetoIntegradoNequi {
}

var saldo_inicial : Int = 100000

class consultar {

    fun get_saldo_inicial() : Int {

        return saldo_inicial

    }

    fun set_saldo_inicial (operacion : Int) {

        saldo_inicial = operacion

    }

    fun consultar_saldo () {

        var consultar_saldo =  consultar();

        var saldo : Int = consultar_saldo.get_saldo_inicial();

        println("su saldo es $saldo")

    }

}

class loguin {

    var telefono_registrado : Long = 1234567890;
    var contrasenna_registrada : Int = 1234
    var telefono_ingresado : Long = 0;
    var contrasenna_ingresada : Int = 0;
    var validacion = false

    fun get_telefono_registrado () : Long {

        return telefono_registrado;

    }

    fun set_telefono_registrado (telefono_recibido: Long) {

        telefono_registrado = telefono_recibido;

    }

    fun loguin () {

        while (validacion == false) {

            println("digite por favor su numero de telefono");
            telefono_ingresado = readLine()!!.toLong()

            println("digite por favor la contraseña");
            contrasenna_ingresada = readLine()!!.toInt();

            if (telefono_registrado == telefono_ingresado && contrasenna_registrada == contrasenna_ingresada) {

                println("las credenciales de acceso son correctas, bienvenido al systema");

                validacion = true;

            } else if (telefono_registrado != telefono_ingresado && contrasenna_registrada == contrasenna_ingresada) {

                println("el telefono ingresado no corresponde, asi que vuelve a intentarlo");

                validacion = false;

            } else if (telefono_registrado == telefono_ingresado && contrasenna_registrada != contrasenna_ingresada) {

                println("la contraseña ingresadao no corresponde, asi que vuelve a intentarlo");

                validacion = false;

            } else if (telefono_registrado != telefono_ingresado && contrasenna_registrada != contrasenna_ingresada) {

                println("ninguno de los dos campos coincide, asi que vuelve a intentarlo");

                validacion = false;

            }

        }

    }

}

class recargar {

    var telefono : Long = 0;
    var valor_recarga : Int = 0;
    var operacion : Int = 0;

    fun recargar () {

        var llamar_loguin = loguin();
        var llamar_consultar_saldo = consultar();

        println("digite por favor el numero de telefono al que realizara la recarga, y por favor confirme que sea correcto")
        telefono = readLine()!!.toLong();

        println("digite la cantidad de dinero que le recargara a la cuenta a nombre de ese numero de telefono")
        valor_recarga = readLine()!!.toInt()

        if (telefono < 1000000000) {

            println("el numero de telefono es invalido")

        } else if (telefono === llamar_loguin.get_telefono_registrado()) {

            println("la recarga va dirigida a tu numero de telefono, la opcion es invalida")

        } else if (valor_recarga <= llamar_consultar_saldo.get_saldo_inicial() && telefono >= 1000000000 && telefono <= 1999999999) {

            operacion = llamar_consultar_saldo.get_saldo_inicial() - valor_recarga;

            println("la recarga al numero $telefono por un valor de  $valor_recarga, por ello tu saldo final es $operacion")

            llamar_consultar_saldo.set_saldo_inicial(operacion);

        }else {

            println("el valor que desea recargar es mayor a su saldo base")

        }

    }


}

class sacar {

    var llamar_consultar_saldo = consultar()

    var telefono = 0
    var saldo_inicial: Int = llamar_consultar_saldo.get_saldo_inicial();
    var codigo_guardado = 0
    var codigo_ingresado = 0
    var dinero_sacado = 0
    var operacion = 0
    var seguir = false
    var opcion : Int = 0;

    fun sacar_plata () {

        println("por favor digite el numero de telefono del que sacara el dinero")
        telefono = readLine()!!.toInt();

        codigo_guardado = (100000 .. 999999).random();

        println("al numero de telefono ingresado se envio el codigo $codigo_guardado")

        while (seguir === false) {

            println("retirara en cajero o punto fisico")

            println("si es en cajero digite 1 de lo contrario 2")
            opcion = readLine()!!.toInt()

            println("digite por favor el codigo que recibio en su telefono ");
            codigo_ingresado = readLine()!!.toInt();

            if (codigo_ingresado === codigo_guardado) {

                println("digite la cantidad de dinero que desea sacar");
                dinero_sacado = readLine()!!.toInt();

                operacion = saldo_inicial - dinero_sacado;

                println("ya puede reclamar o tomar su dinero");

                println("su saldo inicial era " + llamar_consultar_saldo.get_saldo_inicial() + "y su saldo final es: " + operacion);

                llamar_consultar_saldo.set_saldo_inicial(operacion);

                seguir = true ;

            } else  if (dinero_sacado < 2000) {

                println("debe retirar minimo 2000 pesos")

            } else {

                println("el codigo ingresado es incorrecto, intentelo otra vez");

                seguir = false;

            }

        }

    }



}

fun main() {

    var eleccion: Int = 0;
    var llamar_loguin = loguin();
    var llamar_recargar = recargar();
    var llamar_consultar_saldo = consultar();
    var llamar_sacar_plata = sacar();
    var seguir : Int = 1;

    println("bienvenido a nuestro sistema, para poder acceder a nuestras funciones primero debes ingresar a ru cuenta con numero de telefono y contraseña")

    llamar_loguin.loguin();

    while (seguir === 1) {

        println("a que funcion deseas acceder?")
        println("digite 1 para recargar su nequi")
        println("digite 2 para consultar su saldo")
        println("digite 3 para sacar dinero")
        println("digite 4 para salir del sistema")

        eleccion = readLine()!!.toInt()

        when (eleccion) {

            1 -> {

                llamar_recargar.recargar();

                println("desea hacer otra funcion?, en caso de que lo desee digite uno, en caso contrario digite 2")
                seguir = readLine()!!.toInt()

            }

            2 -> {

                llamar_consultar_saldo.consultar_saldo()

                println("desea hacer otra funcion?, en caso de que lo desee digite uno, en caso contrario digite 2")
                seguir = readLine()!!.toInt()

            }


            3 -> {

                llamar_sacar_plata.sacar_plata()

                println("desea hacer otra funcion?, en caso de que lo desee digite uno, en caso contrario digite 2")
                seguir = readLine()!!.toInt()

            }

            4 -> {

                println("has salido de nequi, hasta la proxima mi vida")

                println("desea hacer otra funcion?, en caso de que lo desee digite uno, en caso contrario digite 2")
                seguir = readLine()!!.toInt()

            }

            else -> println("la opcion ingresada es invalida")

        }

    }

}
