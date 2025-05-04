function generateProfile() {
  const input = document.getElementById('profile-input').value;
  const output = document.getElementById('profile-output');

  if (input.trim() === "") {
    output.innerText = "Please enter your experience and skills.";
    return;
  }

  output.innerText = `📄 Enhanced Profile Summary: \nAs a professional with experience in ${input}, you bring strong capabilities and great potential to excel in modern tech roles.`;
}

function getJobMatches() {
  const results = document.getElementById('job-results');
  results.innerHTML = `
    <li>Frontend Developer at TechCorp</li>
    <li>Backend Java Engineer at InnovateX</li>
    <li>AI Intern at SmartHire</li>
  `;
}