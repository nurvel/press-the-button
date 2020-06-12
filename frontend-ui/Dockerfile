# Stage 1 - build process
FROM node as build-deps
WORKDIR /usr/src/app
COPY package.json yarn.lock ./
RUN yarn
COPY . ./
RUN yarn build

# Stage 2 - production environment
FROM nginx:1.12-alpine

# nginx configuration to communication between frontend and backend
RUN rm /etc/nginx/conf.d/default.conf
COPY frontend.conf /etc/nginx/conf.d

COPY --from=build-deps /usr/src/app/build /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]