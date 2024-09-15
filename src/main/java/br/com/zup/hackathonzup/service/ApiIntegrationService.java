package br.com.zup.hackathonzup.service;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.CompletionResult;

public class ApiIntegrationService {

    //Chave API não encontrada
    private static final String API_KEY = System.getenv("");

    public static void main(String[] args) {

        if (API_KEY == null || API_KEY.isEmpty()) {
            System.err.println("Chave API não encontrada. Defina a variável de ambiente OPENAI_API_KEY.");
            return;
        }
        //Classe OpenAiServise consertada
        OpenAiService service = new OpenAiService(API_KEY);
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt("Palmeiras tem mundial?")
                .model("text-davinci-003")
                .maxTokens(100)
                .build();


    }
}


