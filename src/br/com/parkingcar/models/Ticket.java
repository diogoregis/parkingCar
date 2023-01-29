package br.com.parkingcar.models;

import br.com.parkingcar.tools.Tools;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ticket {

    private static int id;
    private int numeroTicket;
    private LocalDateTime entradaParking;
    private LocalDateTime saidaParking;
    private boolean isLiberado;

    private int proximoId(){
        return ++ id;
    }

    public Ticket() {
        numeroTicket = proximoId();
        this.entradaParking = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
    }

    public int getNumeroTicket(){
        return numeroTicket;
    }

    public LocalDateTime getEntradaParking() {
        return entradaParking;
    }

    public LocalDateTime getSaidaParking() {
        return saidaParking;
    }

    public void setSaidaParking(LocalDateTime saidaParking) {
        this.saidaParking = saidaParking;
    }

    public boolean isLiberado() {
        return isLiberado;
    }

    public void setLiberado(boolean liberado) {
        isLiberado = liberado;
    }

    @Override
    public String toString() {
        return "Ticket{" + "\n" + "Numero do Ticket = [" + this.numeroTicket + "]" + "\n" +
                " entradaParking= " + Tools.dataCompletaFormatada(entradaParking) +
                ", saidaParking= " + Tools.dataCompletaFormatada(saidaParking) +
                ", isLiberado= " + isLiberado +
                '}';
    }

}
