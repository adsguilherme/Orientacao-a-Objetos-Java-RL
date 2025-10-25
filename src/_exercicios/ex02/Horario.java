/*
O usuário informa a hora atual (Brasília) e seleciona uma cidade.
Após obter essas informações, exiba o horário naquela cidade.

Exemplo 1: 21 (horário de Brasília), e a cidade de Nova Iorque = 20.
Exemplo 2: 21 (horário de Brasília), e a cidade de Tóquio = 9.
Exemplo 3: 17 (horário de Brasília), e a cidade de Lisboa = 20.

Nova Iorque: -1 hora.
Tóquio: +12 horas.
Lisboa: +3 horas.
*/

package _exercicios.ex02;

public class Horario {

    // Atributos
    private String cidade;
    private int hora;

    // Construtor para inicializar os atributos
    public Horario(String cidade, int hora) {
        this.cidade = cidade;
        this.hora = hora;

        System.out.println("Horário em " + cidade + ": " + novoHorario() + ":00");
    }

    // Metodo para retornar o horário na cidade selecionada
    private int novoHorario() {
        int horarioLocal = 0;

        switch (cidade) {
            case "Nova Iorque":
            horarioLocal = hora - 1;
            break;

            case "Tóquio":
            horarioLocal = hora + 12;
            break;

            case "Lisboa":
            horarioLocal = hora + 3;
            break;

            default:
            System.out.println("Cidade não encontrada.");
            break;
        }

        if(horarioLocal > 23) {
            horarioLocal = horarioLocal - 24;
        }

        return horarioLocal;
    }
}