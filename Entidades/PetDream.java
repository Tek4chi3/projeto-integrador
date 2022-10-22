package Entidades;

public class PetDream {
    public static void main(String[] args) {


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


        Animal Animal1 = new Animal();

        Animal1.setNome("Scooby");
        Animal1.setEspécie("Cachorro");
        Animal1.setRaça("Pitbull");
        Animal1.setSexo("M");
        Animal1.setIdade(2);
        Animal1.setPeso(26.5);
        Animal1.setPelagem("Preto e curto");
        Animal1.setProcedência("Criado em um lar de cachorros com carinho");


        AnamneseGeral AnamneseGeral1 = new AnamneseGeral();

        AnamneseGeral1.setQueixaPrincipal("O dono do paciente relatou fortes dores na região cervical.");
        AnamneseGeral1.setHistóricoMédicoProgresso("O paciente chegou com fortes dores na região cervical foram indicados o remédio OgraxArto e um equipamento que " +
                "se chama colar cervical para manter a imobilidade do pescoço sem perder conforto. Após 3 semanas, o animal estava em perfeitas condições.");
        AnamneseGeral1.setAlimentação("Alimentação normal");
        AnamneseGeral1.setContactantes("Não é contactante");
        AnamneseGeral1.setAmbienteEmQueVive("Uma casa muito espaçosa utilizada como lar de cachorros");
        AnamneseGeral1.setVacinação("Vacinação completa e em dia.");
        AnamneseGeral1.setVermifugação("Em dia");


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



    }
}
