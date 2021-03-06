package br.com.caelum.empresa.leitor;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class OriginalImportador {
    public List<Gasto> importa(InputStream entrada) throws ParseException
    {
        Scanner leitor = new Scanner(entrada);
        List<Gasto> gastos = new ArrayList<Gasto>();       
        while (leitor.hasNextLine())    {
                SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
                String line = leitor.nextLine();
                String tp = line.substring(0, 6);
                String dt = line.substring(6, 14);
                String vl = line.substring(14, 23);
                String mat = line.substring(23,26);
                String nome = line.substring(26,56);
                String dataNascTxt = line.substring(56);
                double valor = Double.parseDouble(vl);
                int matricula = Integer.parseInt(mat);
                Calendar dataNascimento = Calendar.getInstance();
                dataNascimento.setTime(df.parse(dataNascTxt));
                Calendar dataDespesa = Calendar.getInstance();
                dataDespesa.setTime(df.parse(dt));
                Funcionario funcionario = new Funcionario(nome, matricula, dataNascimento);
                gastos.add(new Gasto(valor,tp,funcionario,dataDespesa));}
                return gastos;
}
}
