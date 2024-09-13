package br.com.zup.hackathonzup.service;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;

public class ApiIntegrationService {

    private static final String API_KEY = "sk-tOkt_si9wISLukRCkey-WKQWo5hPPS-m2unPeg3nKyT3BlbkFJMVxdgiaAhg_FWXvuWAC1JQtlt1bIlP0-_hTR7eFywA";

    public static void main(String[] args) {

        OpenAiService service = new OpenAiService(API_KEY);
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt("Palmeiras tem mundial?")
                .model("text-davinci-003")
                .maxTokens(100)
                .build();
        System.out.println(service.createCompletion(completionRequest).getChoices());
    }
}
