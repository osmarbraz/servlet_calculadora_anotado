
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osmar
 */
@WebServlet(urlPatterns = {"/servlet/ServletFrmCalculadora"})
public class ServletFrmCalculadora extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Calculadora</title></head><body>");
        out.println("<h1>Formulário Calculadora</h1>");
        out.println("<form name=\"FrmCalculadora\" method=\"post\" action=\"ServletCalculadora\">");
        out.println("     Valor A : <input type=text name=\"ValorA\"> <p>");
        out.println("        Opera&ccedil;&atilde;o:");
        out.println("        <select name=\"operacao\" id=\"operacao\">");
        out.println("            <option value=\"adicao\">Adi&ccedil;&atilde;o</option>");
        out.println("            <option value=\"subtracao\">Subtra&ccedil;&atilde;o</option>");
        out.println("            <option value=\"multiplicacao\">Multiplica&ccedil;&atilde;o</option>");
        out.println("            <option value=\"divisao\">Divis&atilde;o</option>");
        out.println("        </select><p>");
        out.println("        Valor B : <input type=text name=\"ValorB\"> <p>");
        out.println("        <input type=\"reset\" value=\"Limpar\">");
        out.println("    <input type=\"submit\" name=\"Calcular\" value=\"Calcular\"> <p>");
        out.println("</form>");
        out.println("</body></html>");
        out.close();
    }
}
