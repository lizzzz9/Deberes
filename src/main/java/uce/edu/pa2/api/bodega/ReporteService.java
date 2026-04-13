package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ReporteService {

    @Inject
    private NotificadorMail notificadorMail;

    public void generar(Pedido pedido) {
        System.out.println("Se esta generando reporte en PDF para: " + pedido.getCliente());
    
        notificadorMail.enviar(pedido.getCorreo(), "Tu reporte ha sido generado");
    }
}