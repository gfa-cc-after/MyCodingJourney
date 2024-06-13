import fetch from "unfetch";
// 2. this method will check to see if the response was successful.
// If the response was successful it will return response
const checkStatus = response => {
    if (response.ok) {
        return response;
    }
    // 3. if error it will return error
    const error = new Error(response.statusText);
    error.response = response;
    return Promise.reject(error);
};

// 1. this is the method that will get us all the students from the backend
export const createUser = user => {
    fetch("/api/v1/users", {
        headers: {
            'Content-Type': 'application/json'
        },
        method: 'POST',
        body: JSON.stringify(user),
    })
.then(checkStatus);
};