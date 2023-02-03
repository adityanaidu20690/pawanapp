#!/bin/bash
git --version
#curl -sL https://rpm.nodesource.com/setup_14.x | sudo bash - &&
#sudo yum install nodejs -y
#node -v
#npm install -g @angular/cli
#ng new addy
cp -rvp /root/addy .
cd addy/
touch Dockerfile
cat<<EOT>> Dockerfile
# Use the Node.js base image
FROM node:14

# Set the working directory
WORKDIR /app

# Copy the package.json and package-lock.json files
COPY package*.json ./

# Install the dependencies
RUN npm install

# Copy the rest of the files
COPY . .

# Build the Angular application
RUN npm run build

# Expose the port on which the application will run
EXPOSE 4200

# Start the application
CMD ["npm", "start"]
EOT
