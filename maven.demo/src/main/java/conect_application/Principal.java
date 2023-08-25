package conect_application;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		dao.conectar();
		int entrada = -1;
		while ((entrada > 0 || entrada == 5)&&entrada <= 5) {
			System.out.println("entrou aqui");
			try {
				entrada = sc.nextInt();
				switch (entrada) {
			    case 1:
			        // alterar
			    	Usuario alt_usuario = new Usuario(11, "pablo", "pablo",'M');//usuario teste
			    	alt_usuario.setSenha("nova senha");
					dao.atualizarUsuario(alt_usuario);
			        break;
			    case 2:
			    	// inserir
			    	Scanner text = new Scanner(System.in);
			    	int id = sc.nextInt();
			    	String nome     = text.next();
			    	String senha    = text.next();
			    	String str_sexo = text.next();
			    	char sexo       = (str_sexo == "M")?'M':'F';
;			    	Usuario create_usuario = new Usuario(id, nome, senha, sexo);
					dao.inserirUsuario(create_usuario);
					text.close();
			    	break;
			    case 3:
			    	// excluir
			    	Usuario del_usuario = new Usuario(11, "pablo", "pablo",'M');//usuario teste
			    	dao.excluirUsuario(del_usuario.getCodigo());
			    	break;
			    case 4:
			    	// listar
			    	Usuario[] list_usuarios = dao.getUsuariosMasculinos();
					for(int i = 0; i < list_usuarios.length; i++) {
						System.out.println(list_usuarios[i].toString());
					}
			    	break;
			    default:
			        break;
			}
			}catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}	
			sc.close();
			dao.close();
		}
	}