package conect_application;

public class Principal {
	
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in)
		DAO dao = new DAO();
		dao.conectar();
		Usuario []arr_user = dao.getUsuarios();
		// for (int i = 0; i < arr_user.length; i++) {
		// 	System.out.println(arr_user[i].getCodigo());
		// 	if (arr_user[i].getCodigo()==69) {
		// 		System.out.println(arr_user[i].getLogin());
		// 	}
		// }
		dao.close();
		}
	}