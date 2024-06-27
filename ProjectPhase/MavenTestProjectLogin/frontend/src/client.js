import fetch from "unfetch";

// This method will check to see if the response was successful.
// If the response was successful it will return response.
const checkStatus = response => {
    if (response.ok) {
        return response;
    }

    // If error, it will return error.
    const error = new Error(response.statusText);
    error.response = response;
    return Promise.reject(error);
};

// This is the method that will get us all the students from the backend.
export const createUser = user =>
    fetch("http://localhost:8080/api/v1/users", {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(user)
    })
        .then(checkStatus)
        .then(response => response.json())
        .catch(error => {
            console.error('Error:', error.message);
            // Handle error as needed
        });
