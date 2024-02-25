package com.allergy.allergy.ChatAi.chatResponse;

import com.allergy.allergy.ChatAi.message.Message;

import java.util.List;

public class ChatResponse {

    private List<Choice> choices;

    public ChatResponse() {

    }

    public ChatResponse(List<Choice> choices) {
        this.choices = choices;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "Response{" +
                "choices=" + choices +
                '}';
    }

    //The choice class
    public static class Choice {
        private int id;
        private Message message;

        public Choice() {

        }

        public Choice(int id, Message message) {
            this.id = id;
            this.message = message;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Choice{" +
                    "id=" + id +
                    ", message=" + message +
                    '}';
        }
    }
}
