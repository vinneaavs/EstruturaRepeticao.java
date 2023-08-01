public class Array {
    public static void main(String[] args) {
        String alunos[] = {"ALUNO1", "ALUNO2", "ALUNO3"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O Aluno no indice x=" + i + " é "+ alunos[i]);
        }
        for(String aluno:alunos){
            System.out.println("O Aluno no indice x=" + aluno);

        }
    }
}
