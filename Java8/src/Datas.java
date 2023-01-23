import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		// Imprime o dia atuaç
		LocalDate hoje = LocalDate.now();
		System.out.println("Exibe o dia atual: " + hoje);
		System.out.println();

		// Passa um dia específico para o Local
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 16);
		System.out.println("Exibe o dia das passado: " + olimpiadasRio);
		System.out.println();

		// Diferença em anos entre as olimpiadas rio e o ano atual
		System.out.println(
				"Diferença em anos entre as olimpiadas e o ano atual: " + (olimpiadasRio.getYear() - hoje.getYear()));
		System.out.println();

		// Define o periodo entre duas datas (possue diferentes métodos para trabalhar
		// com datas)
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println("Exibe a diferença do dia atual para o dia das olimpiadas: " + periodo.getDays());
		System.out.println("Exibe a diferença em meses do mês atual para o mês das olimpiadas: " + periodo.getMonths());
		System.out.println();

		// Soma 4 anos nas olimpiadas Rio
		LocalDate proximaOlimpiada = olimpiadasRio.plusYears(4);
		System.out.println(proximaOlimpiada);
		System.out.println();

		// Formata a data conforme o padrão definido
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = proximaOlimpiada.format(formatador);
		System.out.println("Exibe data formatada: " + dataFormatada);
		System.out.println();

		// Formata data com horas conforme padrão definido
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		String dataFormatadaComHora = agora.format(formatadorComHoras);
		System.out.println("Exibe data e hora formatadas: " + dataFormatadaComHora);
		System.out.println();

		// Imprime a data local
		System.out.println("Exibe Data Local: " + agora.toLocalDate().format(formatador));
		System.out.println();

		// Cria um mês e ano específico
		YearMonth mes = YearMonth.of(2023, Month.JUNE);

		// Cria um invervalo de horas com LocalTime (Hora e minutos)
		LocalTime invervalo = LocalTime.of(15, 30);
		System.out.println("AAAA-MM = " + mes + " - hh:mm " + invervalo);
	}

}
