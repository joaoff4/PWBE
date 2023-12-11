
import com.fasterxml.jackson.databind.ObjectMapper;


public class TesteJSON {

	public static void main(String[] args) {
		
		try {
			ObjectMapper obj = new ObjectMapper();
			//objeto para utilizar na serialização
			Pessoa p1 = new Pessoa("Cesar", 44);
			
			//Serealizar o obj p1
			String json = obj.writeValueAsString(p1);
			System.out.println("Objeto Serializado");
			System.out.println(json);
			
			//deserializar o JSON para o obj p1
			Pessoa desPessoa = obj.readValue(json, Pessoa.class);
			System.out.println("Json deserializado para obj Pessoa");
			System.out.println("Nome: " + desPessoa.getNome());
			System.out.println("Idade: " + desPessoa.getIdade());

			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
