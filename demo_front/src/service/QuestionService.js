import axios from 'axios';

const QUESTION_API_BASE_URL = "http://localhost:8080/api/questions/";

class QuestionService {

    getQuestion() {

        return axios.get(QUESTION_API_BASE_URL);
    }

    getNextQuestion(userid) {

        return axios.post(QUESTION_API_BASE_URL+"/userid="+userid);
    }
}

export default new QuestionService()