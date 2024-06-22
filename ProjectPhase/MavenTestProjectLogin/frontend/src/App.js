import './LoginForm.css';

import React, { useRef, useState } from 'react';
import { Button, Form, Input } from 'antd';
import { createUser } from './client';
import { errorNotification, successNotification } from './Notification';

const App = () => {
  const formRef = useRef(null);
  const [submitting, setSubmitting] = useState(false);

  const onFinish = user => {
    setSubmitting(true);
    console.log(JSON.stringify(user, null, 2));
    createUser(user)
        .then(() => {
          console.log("user added");
          successNotification(
              "user added successfully",
              `${user.name} was added to the system`
          );
        })
        .catch(err => {
          console.log(err.response);
          err.response.json().then(res => {
            console.log(res);
            errorNotification(
                "There was an issue",
                `${res.message}[${res.status}][${res.error}]`
            );
          });
        })
        .finally(() => {
          setSubmitting(false);
        });
  };

  const onFinishFailed = errorInfo => {
    alert(JSON.stringify(errorInfo, null, 2));
  };

  return (
      <div className="login-form-container">
        <Form
            name="loginForm"
            ref={formRef}
            onFinishFailed={onFinishFailed}
            onFinish={onFinish}
            initialValues={{ remember: true }}
            className="login-form"
        >
          <h1>Maven PostgreSQL Test APP</h1>
          <Form.Item
              name="email"
              rules={[
                { required: true, message: 'Please enter your email address!' },
                { type: 'email', message: 'Please enter a valid email address!' }
              ]}
              className="login-form-item"
          >
            <Input placeholder="Email Address or phone number" />
          </Form.Item>

          <Form.Item
              name="password"
              rules={[{ required: true, message: 'Please enter your password!' }]}
              className="login-form-item"
          >
            <Input.Password placeholder="Password" />
          </Form.Item>

          <Form.Item className="login-form-item">
            <Button type="primary" htmlType="submit">
              Log In
            </Button>
          </Form.Item>
          {submitting }
        </Form>
      </div>
  );
};

export default App;
