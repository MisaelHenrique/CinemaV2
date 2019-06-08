package br.cinema.model;

public class FormatarString implements Formatar {

	public String cpf(String num, String mascara) {

		/*
		 * @param num contendo a string a ser formatada
		 * 
		 * @param mascara que exibira a string formatada ex: ###.###.###-##
		 *
		 * exigir que a quantidade de caracteres sejam digitados validar CPF com a
		 * formula de validação e validar CPF's com sequencias de numeros iguais, ex.
		 * 111-111-111-11 (charAt)
		 *
		 */
		if (num.length() == 11) {
			if (this.validCPF(num)) {
				int index = 0;
				StringBuilder numFormatado = new StringBuilder();
				for (int i = 0; i < mascara.length(); i++) {
					char numAtual = mascara.charAt(i);
					if (numAtual == '#') {
						numFormatado.append(num.charAt(index));
						index++;
					} else {
						numFormatado.append(numAtual);
					}

				}
				return numFormatado.toString();
			}
		} else {
			return "CPF inválido";
		}
		return "CPF válido";
	}

	
	public boolean validCPF(String num) {
		boolean validcpf = false;

		if (!(num.charAt(0) == num.charAt(1)) && (num.charAt(1) == num.charAt(2))) {

			int soma = 0;

			int n = 10;
			for (int i = 0; i < num.length() - 2; i++) {
				soma = soma + Integer.parseInt("" + num.charAt(i)) * n;
				n--;

			}

			// pegar o resto da divisão % = mod
			// n = 11
			// num.length() - 1

			validcpf = true;

		}

		return validcpf;

	}

	public String cnpj(String num, String mascara) {
		// TODO Auto-generated method stub

		int index = 0;
		StringBuilder cnpjFormatado = new StringBuilder();
		for (int i = 0; i < mascara.length(); i++) {
			char numAtual = mascara.charAt(i);
			if (numAtual == '#') {
				cnpjFormatado.append(num.charAt(index));
				index++;
			} else {
				cnpjFormatado.append(numAtual);
			}

		}

		return cnpjFormatado.toString();
	}

	public String fone(String num, String mascara) {
		// TODO Auto-generated method stub

		int index = 0;
		StringBuilder foneFormatado = new StringBuilder();
		for (int i = 0; i < mascara.length(); i++) {
			char numAtual = mascara.charAt(i);
			if (numAtual == '#') {
				foneFormatado.append(num.charAt(index));
				index++;
			} else {
				foneFormatado.append(numAtual);
			}

		}

		return foneFormatado.toString();
	}

	public String cep(String num, String mascara) {

		/*
		 * @param num contendo a string a ser formatada
		 * 
		 * @param mascara que exibira a string formatada ex: #####-###
		 *
		 */

		int index = 0;
		StringBuilder cepFormatado = new StringBuilder();
		for (int i = 0; i < mascara.length(); i++) {
			char numAtual = mascara.charAt(i);
			if (numAtual == '#') {
				cepFormatado.append(num.charAt(index));
				index++;
			} else {
				cepFormatado.append(numAtual);
			}

		}

		return cepFormatado.toString();
	}

	public boolean validCpf(String num) {
		// TODO Auto-generated method stub
		return false;
	}

}
