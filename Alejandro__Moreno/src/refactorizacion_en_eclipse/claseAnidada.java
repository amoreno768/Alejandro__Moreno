package refactorizacion_en_eclipse;

class claseAnidada {
        /**
		 * 
		 */
		private final InterfaceVentanaDepart claseAnidada;
		/**
		 * @param ventanaDepart
		 */
		claseAnidada(InterfaceVentanaDepart ventanaDepart) {
			claseAnidada = ventanaDepart;
		}
		void entrada (){
                    System.out.println("Método entrada.");
        }
        String salida (int d){
                    System.out.println("Salida.");
                    return "Salida el " +d;
        }
} // fin clase anidada