package Entidades;

import java.util.ArrayList;

public class PetDream {
    public static void main(String[] args) {

        ArrayList lista = new ArrayList();
        ArrayList dono = new ArrayList();
        ArrayList animal = new ArrayList();
        ArrayList exame_físico = new ArrayList();
        ArrayList anamnese_especial = new ArrayList();
        ArrayList anamnese_geral = new ArrayList();

        Dono Dono1 = new Dono();

        Dono1.setNome("Vítor");
        Dono1.setEndereço("Rua EdinaldoSilva Nº160 ,Manaíra");
        Dono1.setCpf("10230651205");
        Dono1.setRg("5019267");
        Dono1.setData("21/10/2022");
        Dono1.setCidade("Juazeiro do Norte");
        Dono1.setUf("CE");
        Dono1.setTelefoneFixo("24027671");
        Dono1.setCelular("085991470283");

        dono.add(Dono1.getNome());
        dono.add(Dono1.getEndereço());
        dono.add(Dono1.getCpf());
        dono.add(Dono1.getRg());
        dono.add(Dono1.getData());
        dono.add(Dono1.getCidade());
        dono.add(Dono1.getUf());
        dono.add(Dono1.getTelefoneFixo());
        dono.add(Dono1.getCelular());

        Animal Animal1 = new Animal();

        Animal1.setNome("Scooby");
        Animal1.setEspécie("Cachorro");
        Animal1.setRaça("Pitbull");
        Animal1.setSexo("M");
        Animal1.setIdade(2);
        Animal1.setPeso(26.5);
        Animal1.setPelagem("Preto e curto");
        Animal1.setProcedência("Criado em um lar de cachorros com carinho");

        animal.add(Animal1.getNome());
        animal.add(Animal1.getEspécie());
        animal.add(Animal1.getRaça());
        animal.add(Animal1.getSexo());
        animal.add(Animal1.getIdade());
        animal.add(Animal1.getPeso());
        animal.add(Animal1.getPelagem());
        animal.add(Animal1.getProcedência());

        AnamneseGeral AnamneseGeral1 = new AnamneseGeral();

        AnamneseGeral1.setQueixaPrincipal("O dono do paciente relatou fortes dores na região cervical.");
        AnamneseGeral1.setHistóricoMédicoProgresso("O paciente chegou com fortes dores na região cervical foram indicados o remédio OgraxArto e um equipamento que " +
                "se chama colar cervical para manter a imobilidade do pescoço sem perder conforto. Após 3 semanas, o animal estava em perfeitas condições.");
        AnamneseGeral1.setAlimentação("Alimentação normal");
        AnamneseGeral1.setContactantes("Não é contactante");
        AnamneseGeral1.setAmbienteEmQueVive("Uma casa muito espaçosa utilizada como lar de cachorros");
        AnamneseGeral1.setVacinação("Vacinação completa e em dia.");
        AnamneseGeral1.setVermifugação("Em dia");

        anamnese_geral.add(AnamneseGeral1.getQueixaPrincipal());
        anamnese_geral.add(AnamneseGeral1.getHistóricoMédicoProgresso());
        anamnese_geral.add(AnamneseGeral1.getAlimentação());
        anamnese_geral.add(AnamneseGeral1.getContactantes());
        anamnese_geral.add(AnamneseGeral1.getAmbienteEmQueVive());
        anamnese_geral.add(AnamneseGeral1.getVacinação());
        anamnese_geral.add(AnamneseGeral1.getVermifugação());

        AnamneseEspecial AnamneseEspecial1 = new AnamneseEspecial();

        AnamneseEspecial1.setSistemaRespiratório("Normal");
        AnamneseEspecial1.setSistemaCardiovascular("Normal");
        AnamneseEspecial1.setSistemaDigestório("Normal");
        AnamneseEspecial1.setSistemaUrinário("Normal");
        AnamneseEspecial1.setSistemaReprodutor("Normal");
        AnamneseEspecial1.setSistemaLocomotor("Dificuldade de locomoção devido a fortes dores na região cervical.");
        AnamneseEspecial1.setSistemaImunológico("Normal");
        AnamneseEspecial1.setPeleEAnexos("Normal");
        AnamneseEspecial1.setOlhos("Normal");

        anamnese_especial.add(AnamneseEspecial1.getSistemaRespiratório());
        anamnese_especial.add(AnamneseEspecial1.getSistemaCardiovascular());
        anamnese_especial.add(AnamneseEspecial1.getSistemaDigestório());
        anamnese_especial.add(AnamneseEspecial1.getSistemaUrinário());
        anamnese_especial.add(AnamneseEspecial1.getSistemaReprodutor());
        anamnese_especial.add(AnamneseEspecial1.getSistemaLocomotor());
        anamnese_especial.add(AnamneseEspecial1.getSistemaImunológico());
        anamnese_especial.add(AnamneseEspecial1.getPeleEAnexos());
        anamnese_especial.add(AnamneseEspecial1.getOlhos());

        ExameFísico ExameFísico1 = new ExameFísico();

        ExameFísico1.setPostura("Postura um pouco comprometida devido a dores na cervical.");
        ExameFísico1.setNívelDeConsciência("Normal");
        ExameFísico1.setEscoreCorporal(5);
        ExameFísico1.setTr(40);
        ExameFísico1.setFr("20-40");
        ExameFísico1.setFc("75-170");
        ExameFísico1.setTpc(2);
        ExameFísico1.setPulso("125-145");
        ExameFísico1.setHidratação("Hidratado");
        ExameFísico1.setLinfonodosSubmandibular("Nível normal");
        ExameFísico1.setLinfonodosPréEscapulares("Nível normal");
        ExameFísico1.setLinfonodosPoplíteos("Nível normal");
        ExameFísico1.setLinfonodosInguinais("Nível normal");
        ExameFísico1.setMucosaOcular("Normal");
        ExameFísico1.setMucosaOral("Normal");
        ExameFísico1.setMucosaPenianaOuVulvar("Normal");
        ExameFísico1.setMucosaAnal("Normal");

        exame_físico.add(ExameFísico1.getPostura());
        exame_físico.add(ExameFísico1.getNívelDeConsciência());
        exame_físico.add(ExameFísico1.getEscoreCorporal());
        exame_físico.add(ExameFísico1.getTr());
        exame_físico.add(ExameFísico1.getFr());
        exame_físico.add(ExameFísico1.getFc());
        exame_físico.add(ExameFísico1.getTpc());
        exame_físico.add(ExameFísico1.getPulso());
        exame_físico.add(ExameFísico1.getHidratação());
        exame_físico.add(ExameFísico1.getLinfonodosSubmandibular());
        exame_físico.add(ExameFísico1.getLinfonodosPréEscapulares());
        exame_físico.add(ExameFísico1.getLinfonodosPoplíteos());
        exame_físico.add(ExameFísico1.getLinfonodosInguinais());
        exame_físico.add(ExameFísico1.getMucosaOcular());
        exame_físico.add(ExameFísico1.getMucosaOral());
        exame_físico.add(ExameFísico1.getMucosaPenianaOuVulvar());
        exame_físico.add(ExameFísico1.getMucosaAnal());



        lista.add(dono+"\n");
        lista.add(animal+"\n");
        lista.add(anamnese_geral+"\n");
        lista.add(anamnese_especial+"\n");
        lista.add(exame_físico+"\n");

        System.out.println(lista);

    }
}
