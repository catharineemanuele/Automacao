import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class getJsonDataObject {
    protected JSONObject getJsonDataObject(String jsonFileName, String dataGroup) {

        // criando um parses para utilizamos no momento da leitura do arquivo json
        JSONParser parser = new JSONParser();

        // criando um objeto json que vai receber os dados do arquivo json
        JSONObject jsonDataObject = null;
        try {
            // inserindo o arquivo json em um objeto
            Object jsonFileObject = parser.parse(new FileReader(System.getProperty("user.dir") + File.separator + "src" +
                    File.separator + "main" + File.separator + "java" + File.separator + "data" + File.separator + jsonFileName));

            // convertendo o objeto com o arquivo json para o formato de objeto json
            jsonDataObject = (JSONObject) jsonFileObject;
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // garantindo que o objeto json não está nulo
        assert jsonDataObject != null;

        // retornando o objeto json, filtrando pelo grupo de dados desejado
        return (JSONObject) jsonDataObject.get(dataGroup);
    }
}
