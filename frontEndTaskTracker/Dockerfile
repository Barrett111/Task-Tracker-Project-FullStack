# Step 1: Build the React app
FROM node:20-alpine as builder
WORKDIR /app
COPY . .
RUN npm install && npm run build

# Step 2: Serve it with Nginx
FROM nginx:alpine
COPY --from=builder /app/dist /usr/share/nginx/html
COPY nginx.conf /etc/nginx/nginx.conf
EXPOSE 80
