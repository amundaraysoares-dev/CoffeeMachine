package AD.Alan

sealed class CoffeeMachineState {
    object E1_Idle : CoffeeMachineState() {
        init { println("[E1] Estado: Idle ") }
    }

    object E2_SeleccionBebida : CoffeeMachineState() {
        init { println("[E2] Estado: Selección de bebida ") }
    }

    data class E3_NoHayBebida(val bebidaId: Int) : CoffeeMachineState() {
        init { println("[E3] Estado: No hay bebida") }
    }

    data class E4_SeleccionAzucar(val bebida: String) : CoffeeMachineState() {
        init { println("[E4] Estado: Selección de azúcar para $bebida ") }
    }

    data class E5_PreparacionSinAzucar(val bebida: String) : CoffeeMachineState() {
        init { println("[E5] Estado: Preparación sin azúcar ($bebida en proceso...)") }
    }

    data class E6_SeleccionCantidadAzucar(val bebida: String) : CoffeeMachineState() {
        init { println("[E6] Estado: Nivel de azúcar (Elige nivel 1-5)") }
    }

    data class E7_ErrorSinAzucar(val bebida: String) : CoffeeMachineState() {
        init { println("[E7] Estado: Error (No queda azúcar en la máquina)") }
    }

    data class E8_PreparacionConAzucar(val bebida: String, val nivelAzucar: Int) : CoffeeMachineState() {
        init { println("[E8] Estado: Preparación con azúcar ($bebida con azúcar nivel $nivelAzucar...)") }
    }

    data class E9_RecogerCafe(val bebida: String) : CoffeeMachineState() {
        init { println("[E9] Estado: Recoger café ($bebida listo en la bandeja)") }
    }
}