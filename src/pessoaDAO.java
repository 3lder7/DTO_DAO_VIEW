import javax.swing.JOptionPane;

public class pessoaDAO {
	
	public void imprimirPessoa(pessoaDTO instPessoaDTO) {
		String nome;
		nome = instPessoaDTO.getNome();
	
		JOptionPane.showMessageDialog(null, nome);
	}
}
