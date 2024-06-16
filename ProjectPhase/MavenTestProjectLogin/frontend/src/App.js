import React, { useRef, useState } from 'react';
import { Form, Input, Button } from 'antd';
import { createUser } from './client';
import { notification } from 'antd';

const App = () => {
    const formRef = useRef(null);
    const [submitting, setSubmitting] = useState(false);

    const openNotificationWithIcon = (type, message, description) => {
        notification[type]({
            message: message,
            description: description,
        });
    };

    const onFinish = user => {
        setSubmitting(true);
        console.log(JSON.stringify(user, null, 2));
        createUser(user)
            .then(() => {
                console.log('User added');
                openNotificationWithIcon('success', 'User added successfully', `${user.name} was added to the system.`);
            })
            .catch(err => {
                console.log(err.response);
                err.response.json().then(res => {
                    console.log(res);
                    openNotificationWithIcon('error', 'There was an issue', `${res.message}[${res.status}][${res.error}]`);
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
                <h1>Facebook Login</h1>
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
                <Form.Item>
                    <Button type="primary" htmlType="submit">
                        Log In
                    </Button>
                </Form.Item>
                {submitting && 'Submitting...'}
            </Form>
        </div>
    );
};

export default App;
